<template>
  <div id="app" v-title data-title="后台管理系统">
    <router-view v-if="isRouterAlive"/>
  </div>
</template>

<style>
*{
  font-family:Helvetica, Tahoma, Arial;
}
html, body, #app {
  margin: 0;
  padding: 0;
}


#app {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;

}
</style>



<script>
import DevicePixelRatio from "@/util/AutoResolution";


export default {
  data() {
    return {
      isRouterAlive: true
    };
  },created() {
    new DevicePixelRatio().init();
  },
  methods: {

  }
}


</script>
