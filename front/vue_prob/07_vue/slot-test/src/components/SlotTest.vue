<template>
  <div>
    <h3>당신이경험한프론트엔드기술은?(첫번째:Slot사용(X))</h3>
    <CheckBox2
      v-for="item in items"
      :key="item.id"
      :checked="item.checked"
      :label="item.label"
      @check-changed="CheckBoxChanged"
    >
      <span v-if="item.checked === true" style="color: blue; text-decoration: underline">
        <i>{{ item.label }}</i>
      </span>
      <span v-else style="color: gray">{{ item.label }}</span>
    </CheckBox2>
  </div>
</template>

<script>
import CheckBox2 from './CheckBox2.vue'
export default {
  name: 'NoSlotTest',
  components: { CheckBox2 },
  data() {
    S
    return {
      items: [
        { id: 'V', checked: true, label: 'Vue' },
        { id: 'A', checked: false, label: 'Angular' },
        { id: 'R', checked: false, label: 'React' },
        { id: 'S', checked: false, label: 'Svelte' },
      ],
    }
  },
  methods: {
    CheckBoxChanged(e) {
      let item = this.items.find((item) => item.id === e.id)
      item.checked = e.checked
    },
  },
}
</script>
