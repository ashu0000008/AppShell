jarsigner -verbose -keystore ���ǩ���ļ� -storepass ����  -keypass alias������ -sigfile CERT -digestalg SHA1 -sigalg MD5withRSA  -signedjar ǩ������ļ� ǩ��ǰ��apk ǩ���ļ���alias����

eg:

jarsigner -verbose -keystore secure.jks -storepass androidsecure -keypass androidsecure -sigfile CERT -digestalg SHA1 -sigalg MD5withRSA -signedjar payload-release.apk payload.apk secure

ǩ���ļ������룺androidsecure
alais�����룺androidsecure
