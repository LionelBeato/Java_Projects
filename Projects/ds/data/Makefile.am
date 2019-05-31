# pkg-config data
# Note that the template file is called ds.pc.in, but generates a
# versioned .pc file using some magic in AC_CONFIG_FILES.
pkgconfigdir = $(libdir)/pkgconfig
pkgconfig_DATA = ds-$(API_VERSION).pc

DISTCLEANFILES = $(pkgconfig_DATA)
EXTRA_DIST = ds.pc.in

-include $(top_srcdir)/git.mk
