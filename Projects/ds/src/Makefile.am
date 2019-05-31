lib_LTLIBRARIES = libds-@API_VERSION@.la

libds_@API_VERSION@_la_SOURCES = \
	ds-version.h \
	ds.h \
	$(NULL)

libds_@API_VERSION@_la_CFLAGS = \
	$(DS_CFLAGS) \
	$(WARN_CFLAGS) \
	$(NULL)

libds_@API_VERSION@_la_LIBADD = \
	$(DS_LIBS) \
	$(NULL)

libds_@API_VERSION@_la_LDFLAGS = \
	$(WARN_LDFLAGS) \
	$(NULL)

-include $(top_srcdir)/git.mk
