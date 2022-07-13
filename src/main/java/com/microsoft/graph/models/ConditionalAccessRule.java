package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ConditionalAccessRule implements ValuedEnum {
    AllApps("allApps"),
    FirstPartyApps("firstPartyApps"),
    Office365("office365"),
    AppId("appId"),
    Acr("acr"),
    AppFilter("appFilter"),
    AllUsers("allUsers"),
    Guest("guest"),
    GroupId("groupId"),
    RoleId("roleId"),
    UserId("userId"),
    AllDevicePlatforms("allDevicePlatforms"),
    DevicePlatform("devicePlatform"),
    AllLocations("allLocations"),
    InsideCorpnet("insideCorpnet"),
    AllTrustedLocations("allTrustedLocations"),
    LocationId("locationId"),
    AllDevices("allDevices"),
    DeviceFilter("deviceFilter"),
    DeviceState("deviceState"),
    UnknownFutureValue("unknownFutureValue"),
    DeviceFilterIncludeRuleNotMatched("deviceFilterIncludeRuleNotMatched"),
    AllDeviceStates("allDeviceStates");
    public final String value;
    ConditionalAccessRule(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConditionalAccessRule forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allApps": return AllApps;
            case "firstPartyApps": return FirstPartyApps;
            case "office365": return Office365;
            case "appId": return AppId;
            case "acr": return Acr;
            case "appFilter": return AppFilter;
            case "allUsers": return AllUsers;
            case "guest": return Guest;
            case "groupId": return GroupId;
            case "roleId": return RoleId;
            case "userId": return UserId;
            case "allDevicePlatforms": return AllDevicePlatforms;
            case "devicePlatform": return DevicePlatform;
            case "allLocations": return AllLocations;
            case "insideCorpnet": return InsideCorpnet;
            case "allTrustedLocations": return AllTrustedLocations;
            case "locationId": return LocationId;
            case "allDevices": return AllDevices;
            case "deviceFilter": return DeviceFilter;
            case "deviceState": return DeviceState;
            case "unknownFutureValue": return UnknownFutureValue;
            case "deviceFilterIncludeRuleNotMatched": return DeviceFilterIncludeRuleNotMatched;
            case "allDeviceStates": return AllDeviceStates;
            default: return null;
        }
    }
}
