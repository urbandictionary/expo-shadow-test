default:
	cat Makefile

.PHONY: shadow
shadow:
	yarn run shadow-cljs watch script

expo:
	expo start -i
