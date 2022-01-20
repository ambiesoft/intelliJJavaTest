package com.ambiesoft.intelliJJavaTest.basic;

class Outer { // 外部クラス

    // メンバクラス➀ static クラス
    static class StaticInner {
        private Integer in;

        public Integer getIn() {
            return in;
        }

        public void setIn(Integer in) {
            this.in = in;
        }
    }

    // メンバクラス➁ 厳密的なメンバクラス
    class Inner {
        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}