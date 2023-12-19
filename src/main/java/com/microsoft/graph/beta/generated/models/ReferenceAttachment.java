package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReferenceAttachment extends Attachment implements Parsable {
    /**
     * Instantiates a new ReferenceAttachment and sets the default values.
     */
    public ReferenceAttachment() {
        super();
        this.setOdataType("#microsoft.graph.referenceAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReferenceAttachment
     */
    @jakarta.annotation.Nonnull
    public static ReferenceAttachment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReferenceAttachment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isFolder", (n) -> { this.setIsFolder(n.getBooleanValue()); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(ReferenceAttachmentPermission::forValue)); });
        deserializerMap.put("previewUrl", (n) -> { this.setPreviewUrl(n.getStringValue()); });
        deserializerMap.put("providerType", (n) -> { this.setProviderType(n.getEnumValue(ReferenceAttachmentProviderType::forValue)); });
        deserializerMap.put("sourceUrl", (n) -> { this.setSourceUrl(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isFolder property value. Specifies whether the attachment is a link to a folder. Must set this to true if sourceUrl is a link to a folder. Optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFolder() {
        return this.backingStore.get("isFolder");
    }
    /**
     * Gets the permission property value. Specifies the permissions granted for the attachment by the type of provider in providerType. Possible values are: other, view, edit, anonymousView, anonymousEdit, organizationView, organizationEdit. Optional.
     * @return a ReferenceAttachmentPermission
     */
    @jakarta.annotation.Nullable
    public ReferenceAttachmentPermission getPermission() {
        return this.backingStore.get("permission");
    }
    /**
     * Gets the previewUrl property value. Applies to only a reference attachment of an image - URL to get a preview image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreviewUrl() {
        return this.backingStore.get("previewUrl");
    }
    /**
     * Gets the providerType property value. The type of provider that supports an attachment of this contentType. Possible values are: other, oneDriveBusiness, oneDriveConsumer, dropbox. Optional.
     * @return a ReferenceAttachmentProviderType
     */
    @jakarta.annotation.Nullable
    public ReferenceAttachmentProviderType getProviderType() {
        return this.backingStore.get("providerType");
    }
    /**
     * Gets the sourceUrl property value. URL to get the attachment content. If this is a URL to a folder, then for the folder to be displayed correctly in Outlook or Outlook on the web, set isFolder to true. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceUrl() {
        return this.backingStore.get("sourceUrl");
    }
    /**
     * Gets the thumbnailUrl property value. Applies to only a reference attachment of an image - URL to get a thumbnail image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.backingStore.get("thumbnailUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isFolder", this.getIsFolder());
        writer.writeEnumValue("permission", this.getPermission());
        writer.writeStringValue("previewUrl", this.getPreviewUrl());
        writer.writeEnumValue("providerType", this.getProviderType());
        writer.writeStringValue("sourceUrl", this.getSourceUrl());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
    }
    /**
     * Sets the isFolder property value. Specifies whether the attachment is a link to a folder. Must set this to true if sourceUrl is a link to a folder. Optional.
     * @param value Value to set for the isFolder property.
     */
    public void setIsFolder(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFolder", value);
    }
    /**
     * Sets the permission property value. Specifies the permissions granted for the attachment by the type of provider in providerType. Possible values are: other, view, edit, anonymousView, anonymousEdit, organizationView, organizationEdit. Optional.
     * @param value Value to set for the permission property.
     */
    public void setPermission(@jakarta.annotation.Nullable final ReferenceAttachmentPermission value) {
        this.backingStore.set("permission", value);
    }
    /**
     * Sets the previewUrl property value. Applies to only a reference attachment of an image - URL to get a preview image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @param value Value to set for the previewUrl property.
     */
    public void setPreviewUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("previewUrl", value);
    }
    /**
     * Sets the providerType property value. The type of provider that supports an attachment of this contentType. Possible values are: other, oneDriveBusiness, oneDriveConsumer, dropbox. Optional.
     * @param value Value to set for the providerType property.
     */
    public void setProviderType(@jakarta.annotation.Nullable final ReferenceAttachmentProviderType value) {
        this.backingStore.set("providerType", value);
    }
    /**
     * Sets the sourceUrl property value. URL to get the attachment content. If this is a URL to a folder, then for the folder to be displayed correctly in Outlook or Outlook on the web, set isFolder to true. Required.
     * @param value Value to set for the sourceUrl property.
     */
    public void setSourceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceUrl", value);
    }
    /**
     * Sets the thumbnailUrl property value. Applies to only a reference attachment of an image - URL to get a thumbnail image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailUrl", value);
    }
}
