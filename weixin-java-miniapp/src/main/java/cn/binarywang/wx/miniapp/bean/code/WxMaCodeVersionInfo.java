package cn.binarywang.wx.miniapp.bean.code;

import cn.binarywang.wx.miniapp.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 查询小程序版本信息
 *
 * @author <a href="https://github.com/leonxi">LeonXi</a>
 * @since 2022-04-13 16:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxMaCodeVersionInfo implements Serializable {

  @SerializedName("exp_info")
  private ExpInfo expInfo;

  @SerializedName("release_info")
  private ReleaseInfo releaseInfo;

  public static WxMaCodeVersionInfo fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json, WxMaCodeVersionInfo.class);
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  static class ExpInfo implements Serializable {

    @SerializedName("exp_time")
    private Long expTime;

    @SerializedName("exp_version")
    private String expVersion;

    @SerializedName("exp_desc")
    private String expDesc;
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  static class ReleaseInfo implements Serializable {

    @SerializedName("release_time")
    private Long releaseTime;

    @SerializedName("release_version")
    private String releaseVersion;

    @SerializedName("release_desc")
    private String releaseDesc;
  }
}
