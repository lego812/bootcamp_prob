<template>
  <div>
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="$emit('check-changed', { id, checked: $event.target.checked })"
    />
    <slot>Item</slot>
  </div>
</template>

<script>
export default { name: 'checkBox2', props: ['id', 'checked'] }
</script>

<style lang="scss" scoped></style>
