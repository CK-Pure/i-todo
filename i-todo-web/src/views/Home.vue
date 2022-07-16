<template>
  <div class="i-todo-home" @click="homeClick">
    <video autoplay loop muted style="width: 100vw;height: 100vh;object-fit: fill">
      <source src="../assets/video/DD.mp4" type="video/mp4">
    </video>
  </div>
</template>

<script>

export default {

  // eslint-disable-next-line vue/multi-word-component-names
  name:"Home",
  components:{

  },

  data(){
    return{

    }
  },
  methods:{
    homeClick(){
      this.$router.push({
        path:"/user"
      })
    },
  }

}
</script>

<style scoped>

</style>