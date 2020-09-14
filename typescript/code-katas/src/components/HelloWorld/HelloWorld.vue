<template>
  <div>
    Hello, {{ text }}
  </div>
</template>

<script lang="ts">
import {Component, Prop, Vue} from "vue-property-decorator";

@Component
export default class HelloWorld extends Vue {
  @Prop({default: 'World'})
  private msg!: string;

  get text() {
    return this.correctText(this.msg);
  }

  private correctText(msg: string): string {
    const message = msg;
    const firstLetter = message[0].toUpperCase();
    const restOfWord = message.slice(1).toLowerCase();
    return firstLetter + restOfWord + '!';
  }
}
</script>
