
if [[ $# != 2 ]] ; then
echo "USAGE: $0 number title "
echo " e.g.: $0 5 LongestPalindrome"
exit 1;
fi

MAIN_PREFIX="src/main/java"
TEST_PREFIX="src/test/java"

NUMBER=$(printf "%05d\n" ${1})
TITLE=${2}
CLASSNAME="L_${NUMBER}_${TITLE}"

mkdir -p ${MAIN_PREFIX}
mkdir -p ${TEST_PREFIX}



echo ""                                 >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo "/**"                              >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo " * 题目："                         >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo " *"                               >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo " *"                               >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo " * @author gaomingjie, jackgo73@outlook.com"                                                  >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo " * @see <a href="https://mutex73.github.io/${MAIN_PREFIX}/${CLASSNAME}.java">SOURCE CODE</a>" >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo " */"                              >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo ""                                 >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo "public class ${CLASSNAME} {"      >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo ""                                 >> ${MAIN_PREFIX}/${CLASSNAME}.java
echo "}"                                >> ${MAIN_PREFIX}/${CLASSNAME}.java



echo ""                                 >> ${TEST_PREFIX}/${CLASSNAME}Test.java
echo "public class ${CLASSNAME}Test {"      >> ${TEST_PREFIX}/${CLASSNAME}Test.java
echo ""                                 >> ${TEST_PREFIX}/${CLASSNAME}Test.java
echo "}"                                >> ${TEST_PREFIX}/${CLASSNAME}Test.java

