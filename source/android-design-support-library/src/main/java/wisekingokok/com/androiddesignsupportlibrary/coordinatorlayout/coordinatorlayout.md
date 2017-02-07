### 定义

CoordinatorLayout是这次新添加的一个增强型的FrameLayout.可以通过Behaviors调度协调子布局。

### Tips
自定义Behavior

        @Override
        public boolean layoutDependsOn(CoordinatorLayout parent, V child, View dependency) {
            //返回false表示child不依赖dependency，ture表示依赖
            return true;
        }

        //每次dependency位置发生变化，都会执行onDependentViewChanged方法
        @Override
        public boolean onDependentViewChanged(CoordinatorLayout parent, TextView btn, View dependency) {}

