<template>
  <div>
    <svg-icon icon-class="question" @click="goto"/>
  </div>
</template>

<script>
export default {
  name: 'ApmDoc',
  data() {
    return {
      url: 'http://doc.saber-king.cn/apm-vue'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>