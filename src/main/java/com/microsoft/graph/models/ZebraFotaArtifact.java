package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes a single artifact for a specific device model.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ZebraFotaArtifact extends Entity implements Parsable {
    /**
     * Instantiates a new ZebraFotaArtifact and sets the default values.
     */
    public ZebraFotaArtifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ZebraFotaArtifact
     */
    @jakarta.annotation.Nonnull
    public static ZebraFotaArtifact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaArtifact();
    }
    /**
     * Gets the boardSupportPackageVersion property value. The version of the Board Support Package (BSP. E.g.: 01.18.02.00)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBoardSupportPackageVersion() {
        return this.backingStore.get("boardSupportPackageVersion");
    }
    /**
     * Gets the description property value. Artifact description. (e.g.: `LifeGuard Update 98 (released 24-September-2021)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceModel property value. Applicable device model (e.g.: TC8300)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("boardSupportPackageVersion", (n) -> { this.setBoardSupportPackageVersion(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("patchVersion", (n) -> { this.setPatchVersion(n.getStringValue()); });
        deserializerMap.put("releaseNotesUrl", (n) -> { this.setReleaseNotesUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osVersion property value. Artifact OS version (e.g.: 8.1.0)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the patchVersion property value. Artifact patch version (e.g.: U00)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPatchVersion() {
        return this.backingStore.get("patchVersion");
    }
    /**
     * Gets the releaseNotesUrl property value. Artifact release notes URL (e.g.: https://www.zebra.com/<filename.pdf>)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReleaseNotesUrl() {
        return this.backingStore.get("releaseNotesUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("boardSupportPackageVersion", this.getBoardSupportPackageVersion());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("patchVersion", this.getPatchVersion());
        writer.writeStringValue("releaseNotesUrl", this.getReleaseNotesUrl());
    }
    /**
     * Sets the boardSupportPackageVersion property value. The version of the Board Support Package (BSP. E.g.: 01.18.02.00)
     * @param value Value to set for the boardSupportPackageVersion property.
     */
    public void setBoardSupportPackageVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("boardSupportPackageVersion", value);
    }
    /**
     * Sets the description property value. Artifact description. (e.g.: `LifeGuard Update 98 (released 24-September-2021)
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceModel property value. Applicable device model (e.g.: TC8300)
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the osVersion property value. Artifact OS version (e.g.: 8.1.0)
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the patchVersion property value. Artifact patch version (e.g.: U00)
     * @param value Value to set for the patchVersion property.
     */
    public void setPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("patchVersion", value);
    }
    /**
     * Sets the releaseNotesUrl property value. Artifact release notes URL (e.g.: https://www.zebra.com/<filename.pdf>)
     * @param value Value to set for the releaseNotesUrl property.
     */
    public void setReleaseNotesUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("releaseNotesUrl", value);
    }
}
