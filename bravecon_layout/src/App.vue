<template>
  <div id="app" v-title data-title="后台管理系统">
    <router-view v-if="isRouterAlive"/>
  </div>
</template>

<style>
*{
  font-family:Helvetica, Tahoma, Arial;
}
*::selection {
  background:#ccc;
}
*::-moz-selection {
  background:#ccc;
}
html, body, #app {
  margin: 0;
  padding: 0;
}
.el-header,.el-main,.el-footer{
  padding: 0px !important;
}

.el-radio__input.is-checked .el-radio__inner {
  border-color: #767676;
  background: #767676;
}
#app {
  width: 100%;
  height: 100%;
}
</style>



<script>
export default {
  data() {
    return {
      isRouterAlive: true
    };
  },
  methods: {

  }
}


</script>
