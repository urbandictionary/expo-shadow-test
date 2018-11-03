default:
	cat Makefile

.PHONY: shadow
shadow:
	yarn run shadow-cljs watch script

expo:
	yarn run expo start -i
