(defproject square-vis "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"],
  				 [quil "1.6.0"],
  				 [com.novemberain/monger "1.5.0"]]
  :main ^:skip-aot square-vis.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

