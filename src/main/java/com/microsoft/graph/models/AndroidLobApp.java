package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Android Line Of Business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidLobApp extends MobileLobApp implements Parsable {
    /**
     * Instantiates a new AndroidLobApp and sets the default values.
     */
    public AndroidLobApp() {
        super();
        this.setOdataType("#microsoft.graph.androidLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidLobApp
     */
    @jakarta.annotation.Nonnull
    public static AndroidLobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidLobApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identityName", (n) -> { this.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(AndroidMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("targetedPlatforms", (n) -> { this.setTargetedPlatforms(n.getEnumSetValue(AndroidTargetedPlatforms::forValue)); });
        deserializerMap.put("versionCode", (n) -> { this.setVersionCode(n.getStringValue()); });
        deserializerMap.put("versionName", (n) -> { this.setVersionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityName property value. The Identity Name. This property is being deprecated in 2302(February 2023).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityName() {
        return this.backingStore.get("identityName");
    }
    /**
     * Gets the identityVersion property value. The identity version. This property is being deprecated in 2302(February 2023).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.backingStore.get("identityVersion");
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a AndroidMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public AndroidMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.backingStore.get("minimumSupportedOperatingSystem");
    }
    /**
     * Gets the packageId property value. The package identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.backingStore.get("packageId");
    }
    /**
     * Gets the targetedPlatforms property value. Specifies which platform(s) can be targeted for a given Android LOB application or Managed Android LOB application.
     * @return a EnumSet<AndroidTargetedPlatforms>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AndroidTargetedPlatforms> getTargetedPlatforms() {
        return this.backingStore.get("targetedPlatforms");
    }
    /**
     * Gets the versionCode property value. The version code of Android Line of Business (LoB) app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersionCode() {
        return this.backingStore.get("versionCode");
    }
    /**
     * Gets the versionName property value. The version name of Android Line of Business (LoB) app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersionName() {
        return this.backingStore.get("versionName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeEnumSetValue("targetedPlatforms", this.getTargetedPlatforms());
        writer.writeStringValue("versionCode", this.getVersionCode());
        writer.writeStringValue("versionName", this.getVersionName());
    }
    /**
     * Sets the identityName property value. The Identity Name. This property is being deprecated in 2302(February 2023).
     * @param value Value to set for the identityName property.
     */
    public void setIdentityName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityName", value);
    }
    /**
     * Sets the identityVersion property value. The identity version. This property is being deprecated in 2302(February 2023).
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityVersion", value);
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final AndroidMinimumOperatingSystem value) {
        this.backingStore.set("minimumSupportedOperatingSystem", value);
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageId", value);
    }
    /**
     * Sets the targetedPlatforms property value. Specifies which platform(s) can be targeted for a given Android LOB application or Managed Android LOB application.
     * @param value Value to set for the targetedPlatforms property.
     */
    public void setTargetedPlatforms(@jakarta.annotation.Nullable final EnumSet<AndroidTargetedPlatforms> value) {
        this.backingStore.set("targetedPlatforms", value);
    }
    /**
     * Sets the versionCode property value. The version code of Android Line of Business (LoB) app.
     * @param value Value to set for the versionCode property.
     */
    public void setVersionCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionCode", value);
    }
    /**
     * Sets the versionName property value. The version name of Android Line of Business (LoB) app.
     * @param value Value to set for the versionName property.
     */
    public void setVersionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionName", value);
    }
}
