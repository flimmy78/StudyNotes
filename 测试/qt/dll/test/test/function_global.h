#ifndef FUNCTION_GLOBAL_H
#define FUNCTION_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(FUNCTION_LIBRARY)
#  define FUNCTIONSHARED_EXPORT Q_DECL_EXPORT
#else
#  define FUNCTIONSHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // FUNCTION_GLOBAL_H
