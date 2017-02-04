### 定义

介于Toast和Dialog之间的一个轻量级通知控件

### 基础语法

    Snackbar.make(view, message, duration)
           .setAction(action message, click listener)
           .show();

### Material Design设计规范

通常 Snackbar 的高度应该仅仅用于容纳所有的文本，而文本应该与执行的操作相关。Snackbar 中不能包含图标，操作只能以文本的形式存在。

当一个动作发生的时候，应当符合提示框和可用性规则。当有2个或者2个以上的操作出现时，应该使用提示框而不是 Snackbar，即使其中的一个是取消操作。如果 Snackbar 中提示的操作重要到需要打断屏幕上正在进行的操作，那么理当使用提示框而非 Snackbar。