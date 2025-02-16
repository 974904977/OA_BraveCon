import Vue from 'vue'
import VueRouter from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'login',
    component: () => import("../views/Login.vue"),
  },
  // {
  //   path: '/reg',
  //   name: 'reg',
  //   component: () => import("../views/front/reg.vue")
  // },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
