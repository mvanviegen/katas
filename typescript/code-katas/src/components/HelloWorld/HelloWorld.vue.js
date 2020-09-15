import { __decorate, __extends } from "tslib";
import { Component, Prop, Vue } from "vue-property-decorator";
var HelloWorld = /** @class */ (function (_super) {
    __extends(HelloWorld, _super);
    function HelloWorld() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Object.defineProperty(HelloWorld.prototype, "text", {
        get: function () {
            return this.correctText(this.msg);
        },
        enumerable: false,
        configurable: true
    });
    HelloWorld.prototype.correctText = function (msg) {
        var message = msg;
        var firstLetter = message[0].toUpperCase();
        var restOfWord = message.slice(1).toLowerCase();
        return firstLetter + restOfWord + '!';
    };
    __decorate([
        Prop({ default: 'World' })
    ], HelloWorld.prototype, "msg", void 0);
    HelloWorld = __decorate([
        Component
    ], HelloWorld);
    return HelloWorld;
}(Vue));
export default HelloWorld;
//# sourceMappingURL=HelloWorld.vue.js.map