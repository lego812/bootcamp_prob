<template>
  <div>
    <InputName @nameChanged="nameChangeHandler" />
    <br />
    <h2>App 데이터 : {{ parentName }}</h2>
  </div>
</template>

<script>
import InputName from './components/InputName.vue';
export default {
  name: 'App',
  components: { InputName },
  data() {
    return { parentName: '' };
  },

  methods: {
    nameChangeHandler(e) {
      this.parentName = e.name;
    },
  },
};
</script>

<style lang="scss" scoped></style>
