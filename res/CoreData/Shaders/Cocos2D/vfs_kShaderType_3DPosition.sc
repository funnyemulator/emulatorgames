�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,yQ�ŧ+]����O�
�1��[�ys�fDW.�D[2]]�߽.[Ӗ9p�̷N�HC�Uz�b�����9����mr�sq�GP�)�|'���&	*y��Dp��#6��tN�����7�s*Q��/۷���5����#���,��gto��֡�:-+��"G�7 ߇��� ��P��7��@;y@��������6g�t58H,��ſ��.xS��֬6�Qb)(LD�����H��b�s�pDL�G�����@ڥU�cք�eh����y�L��d��toQ��p�wn�$� �����g:��Ϣ�l �=�ϖ[W.dꀂP�m����� �!6�U����P���n-^���,b�6o�U�LҒ���H	��Z�9�ݿ��Y-��[�� ���#���=_��t�?[.A��iUޙ��;���N��ɋ>���|	��£q<~�sS�4�u�~[:jp;ƞ���@worldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../�ibrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma'4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_�inTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


voidZmain()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
