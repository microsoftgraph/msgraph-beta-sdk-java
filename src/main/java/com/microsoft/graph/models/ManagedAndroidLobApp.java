package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Managed Android Line Of Business apps.
 */
public class ManagedAndroidLobApp extends ManagedMobileLobApp implements Parsable {
    /**
     * The Identity Name. This property is being deprecated in 2302(February 2023).
     */
    private String identityName;
    /**
     * The identity version. This property is being deprecated in 2302(February 2023).
     */
    private String identityVersion;
    /**
     * The value for the minimum applicable operating system.
     */
    private AndroidMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The package identifier.
     */
    private String packageId;
    /**
     * Specifies which platform(s) can be targeted for a given Android LOB application or Managed Android LOB application.
     */
    private AndroidTargetedPlatforms targetedPlatforms;
    /**
     * The version code of managed Android Line of Business (LoB) app.
     */
    private String versionCode;
    /**
     * The version name of managed Android Line of Business (LoB) app.
     */
    private String versionName;
    /**
     * Instantiates a new managedAndroidLobApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedAndroidLobApp() {
        super();
        this.setOdataType("#microsoft.graph.managedAndroidLobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedAndroidLobApp
     */
    @jakarta.annotation.Nonnull
    public static ManagedAndroidLobApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAndroidLobApp();
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
        deserializerMap.put("targetedPlatforms", (n) -> { this.setTargetedPlatforms(n.getEnumValue(AndroidTargetedPlatforms.class)); });
        deserializerMap.put("versionCode", (n) -> { this.setVersionCode(n.getStringValue()); });
        deserializerMap.put("versionName", (n) -> { this.setVersionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityName property value. The Identity Name. This property is being deprecated in 2302(February 2023).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdentityName() {
        return this.identityName;
    }
    /**
     * Gets the identityVersion property value. The identity version. This property is being deprecated in 2302(February 2023).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @return a androidMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public AndroidMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the packageId property value. The package identifier.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
    }
    /**
     * Gets the targetedPlatforms property value. Specifies which platform(s) can be targeted for a given Android LOB application or Managed Android LOB application.
     * @return a androidTargetedPlatforms
     */
    @jakarta.annotation.Nullable
    public AndroidTargetedPlatforms getTargetedPlatforms() {
        return this.targetedPlatforms;
    }
    /**
     * Gets the versionCode property value. The version code of managed Android Line of Business (LoB) app.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersionCode() {
        return this.versionCode;
    }
    /**
     * Gets the versionName property value. The version name of managed Android Line of Business (LoB) app.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersionName() {
        return this.versionName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeEnumValue("targetedPlatforms", this.getTargetedPlatforms());
        writer.writeStringValue("versionCode", this.getVersionCode());
        writer.writeStringValue("versionName", this.getVersionName());
    }
    /**
     * Sets the identityName property value. The Identity Name. This property is being deprecated in 2302(February 2023).
     * @param value Value to set for the identityName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIdentityName(@jakarta.annotation.Nullable final String value) {
        this.identityName = value;
    }
    /**
     * Sets the identityVersion property value. The identity version. This property is being deprecated in 2302(February 2023).
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The value for the minimum applicable operating system.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final AndroidMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the packageId property value. The package identifier.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.packageId = value;
    }
    /**
     * Sets the targetedPlatforms property value. Specifies which platform(s) can be targeted for a given Android LOB application or Managed Android LOB application.
     * @param value Value to set for the targetedPlatforms property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargetedPlatforms(@jakarta.annotation.Nullable final AndroidTargetedPlatforms value) {
        this.targetedPlatforms = value;
    }
    /**
     * Sets the versionCode property value. The version code of managed Android Line of Business (LoB) app.
     * @param value Value to set for the versionCode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersionCode(@jakarta.annotation.Nullable final String value) {
        this.versionCode = value;
    }
    /**
     * Sets the versionName property value. The version name of managed Android Line of Business (LoB) app.
     * @param value Value to set for the versionName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersionName(@jakarta.annotation.Nullable final String value) {
        this.versionName = value;
    }
}
