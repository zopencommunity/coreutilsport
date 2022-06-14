#!/bin/sh
INSTALL_DIR="$1"

cat <<EOF > ${INSTALL_DIR}/.env
export PATH="${INSTALL_DIR}/bin:\$PATH"
EOF

exit 0
