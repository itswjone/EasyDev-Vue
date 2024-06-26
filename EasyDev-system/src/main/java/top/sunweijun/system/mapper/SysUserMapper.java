package top.sunweijun.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.sunweijun.system.domain.entity.SysUser;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.system.mapper
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  09:08
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface SysUserMapper {
    public int insertUser(@Param("user") SysUser user);
}
