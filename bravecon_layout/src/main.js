import Vue from 'vue'
import App from './App.vue'
import router from './router'

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from 'axios'

import VueRouter from 'vue-router'


//  全局注册 elementUI
Vue.use(ElementUI);
Vue.use(VueRouter),
// 设置axios，默认前缀路径
axios.defaults.baseURL='http://localhost:9966'
axios.defaults.headers.post['Content-Type']='application/json'
// 设置全局变量
Vue.prototype.$http=axios;
Vue.prototype.uploadPath='http://localhost:9966';

Vue.config.productionTip = false

Vue.directive('title', {
    inserted: function (el, binding) {
        document.title = el.dataset.title
    }
})
new Vue({
    router,
    render: h => h(App)
}).$mount('#app')
