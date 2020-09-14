import { shallowMount } from '@vue/test-utils';
import HelloWorld from '@/components/HelloWorld/HelloWorld.vue';

describe('Hello World', () => {
    it('should render correct string given passed parameter', () => {
        const msg = 'You';
        const wrapper = shallowMount(HelloWorld, {
            propsData: { msg },
        });
        expect(wrapper.text()).toBe("Hello, You!");
    });

    it('should render correct string given parameter with typos', () => {
        const msg = 'aLIcE';
        const wrapper = shallowMount(HelloWorld, {
            propsData: { msg },
        });
        expect(wrapper.text()).toBe("Hello, Alice!");
    });

    it('should render Hello World! given no parameter', () => {
        const wrapper = shallowMount(HelloWorld);
        expect(wrapper.text()).toBe("Hello, World!");
    });
});
