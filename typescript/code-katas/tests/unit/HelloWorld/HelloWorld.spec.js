import { shallowMount } from '@vue/test-utils';
import HelloWorld from '@/components/HelloWorld/HelloWorld.vue';
describe('Hello World', function () {
    it('should render correct string given passed parameter', function () {
        var msg = 'You';
        var wrapper = shallowMount(HelloWorld, {
            propsData: { msg: msg },
        });
        expect(wrapper.text()).toBe("Hello, You!");
    });
    it('should render correct string given parameter with typos', function () {
        var msg = 'aLIcE';
        var wrapper = shallowMount(HelloWorld, {
            propsData: { msg: msg },
        });
        expect(wrapper.text()).toBe("Hello, Alice!");
    });
    it('should render Hello World! given no parameter', function () {
        var wrapper = shallowMount(HelloWorld);
        expect(wrapper.text()).toBe("Hello, World!");
    });
});
//# sourceMappingURL=HelloWorld.spec.js.map