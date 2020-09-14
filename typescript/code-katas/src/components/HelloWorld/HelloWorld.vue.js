import { __extends } from "tslib";
var HelloWorld = /** @class */ (function (_super) {
    __extends(HelloWorld, _super);
    function HelloWorld() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return HelloWorld;
}(Vue));
export default HelloWorld;
{
    return this.correctText(this.msg);
}
methods: {
    // need annotation
    correctText(msg);
    string;
    {
        var firstLetter = msg[0].toUpperCase();
        var restOfWord = msg.slice(1).toLowerCase();
        return firstLetter + restOfWord + '!';
    }
}
//# sourceMappingURL=HelloWorld.vue.js.map