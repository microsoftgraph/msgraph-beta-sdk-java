package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPackageDetail extends CopilotPackage implements Parsable {
    /**
     * Instantiates a new {@link CopilotPackageDetail} and sets the default values.
     */
    public CopilotPackageDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPackageDetail}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPackageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPackageDetail();
    }
    /**
     * Gets the acquireUsersAndGroups property value. The acquireUsersAndGroups property
     * @return a {@link java.util.List<PackageAccessEntity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageAccessEntity> getAcquireUsersAndGroups() {
        return this.backingStore.get("acquireUsersAndGroups");
    }
    /**
     * Gets the allowedUsersAndGroups property value. The allowedUsersAndGroups property
     * @return a {@link java.util.List<PackageAccessEntity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageAccessEntity> getAllowedUsersAndGroups() {
        return this.backingStore.get("allowedUsersAndGroups");
    }
    /**
     * Gets the categories property value. The categories property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the elementDetails property value. The elementDetails property
     * @return a {@link java.util.List<PackageElementDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PackageElementDetail> getElementDetails() {
        return this.backingStore.get("elementDetails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acquireUsersAndGroups", (n) -> { this.setAcquireUsersAndGroups(n.getCollectionOfObjectValues(PackageAccessEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedUsersAndGroups", (n) -> { this.setAllowedUsersAndGroups(n.getCollectionOfObjectValues(PackageAccessEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("elementDetails", (n) -> { this.setElementDetails(n.getCollectionOfObjectValues(PackageElementDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("longDescription", (n) -> { this.setLongDescription(n.getStringValue()); });
        deserializerMap.put("manifestVersion", (n) -> { this.setManifestVersion(n.getStringValue()); });
        deserializerMap.put("sensitivity", (n) -> { this.setSensitivity(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the longDescription property value. The longDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLongDescription() {
        return this.backingStore.get("longDescription");
    }
    /**
     * Gets the manifestVersion property value. The manifestVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManifestVersion() {
        return this.backingStore.get("manifestVersion");
    }
    /**
     * Gets the sensitivity property value. The sensitivity property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensitivity() {
        return this.backingStore.get("sensitivity");
    }
    /**
     * Gets the version property value. The version property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acquireUsersAndGroups", this.getAcquireUsersAndGroups());
        writer.writeCollectionOfObjectValues("allowedUsersAndGroups", this.getAllowedUsersAndGroups());
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("elementDetails", this.getElementDetails());
        writer.writeStringValue("longDescription", this.getLongDescription());
        writer.writeStringValue("manifestVersion", this.getManifestVersion());
        writer.writeStringValue("sensitivity", this.getSensitivity());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the acquireUsersAndGroups property value. The acquireUsersAndGroups property
     * @param value Value to set for the acquireUsersAndGroups property.
     */
    public void setAcquireUsersAndGroups(@jakarta.annotation.Nullable final java.util.List<PackageAccessEntity> value) {
        this.backingStore.set("acquireUsersAndGroups", value);
    }
    /**
     * Sets the allowedUsersAndGroups property value. The allowedUsersAndGroups property
     * @param value Value to set for the allowedUsersAndGroups property.
     */
    public void setAllowedUsersAndGroups(@jakarta.annotation.Nullable final java.util.List<PackageAccessEntity> value) {
        this.backingStore.set("allowedUsersAndGroups", value);
    }
    /**
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the elementDetails property value. The elementDetails property
     * @param value Value to set for the elementDetails property.
     */
    public void setElementDetails(@jakarta.annotation.Nullable final java.util.List<PackageElementDetail> value) {
        this.backingStore.set("elementDetails", value);
    }
    /**
     * Sets the longDescription property value. The longDescription property
     * @param value Value to set for the longDescription property.
     */
    public void setLongDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("longDescription", value);
    }
    /**
     * Sets the manifestVersion property value. The manifestVersion property
     * @param value Value to set for the manifestVersion property.
     */
    public void setManifestVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manifestVersion", value);
    }
    /**
     * Sets the sensitivity property value. The sensitivity property
     * @param value Value to set for the sensitivity property.
     */
    public void setSensitivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensitivity", value);
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
