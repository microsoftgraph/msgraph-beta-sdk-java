package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReferenceAttachment extends Attachment implements Parsable {
    /**
     * Specifies whether the attachment is a link to a folder. Must set this to true if sourceUrl is a link to a folder. Optional.
     */
    private Boolean isFolder;
    /**
     * Specifies the permissions granted for the attachment by the type of provider in providerType. Possible values are: other, view, edit, anonymousView, anonymousEdit, organizationView, organizationEdit. Optional.
     */
    private ReferenceAttachmentPermission permission;
    /**
     * Applies to only a reference attachment of an image - URL to get a preview image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     */
    private String previewUrl;
    /**
     * The type of provider that supports an attachment of this contentType. Possible values are: other, oneDriveBusiness, oneDriveConsumer, dropbox. Optional.
     */
    private ReferenceAttachmentProvider providerType;
    /**
     * URL to get the attachment content. If this is a URL to a folder, then for the folder to be displayed correctly in Outlook or Outlook on the web, set isFolder to true. Required.
     */
    private String sourceUrl;
    /**
     * Applies to only a reference attachment of an image - URL to get a thumbnail image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     */
    private String thumbnailUrl;
    /**
     * Instantiates a new ReferenceAttachment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReferenceAttachment() {
        super();
        this.setOdataType("#microsoft.graph.referenceAttachment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReferenceAttachment
     */
    @javax.annotation.Nonnull
    public static ReferenceAttachment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReferenceAttachment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isFolder", (n) -> { this.setIsFolder(n.getBooleanValue()); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getEnumValue(ReferenceAttachmentPermission.class)); });
        deserializerMap.put("previewUrl", (n) -> { this.setPreviewUrl(n.getStringValue()); });
        deserializerMap.put("providerType", (n) -> { this.setProviderType(n.getEnumValue(ReferenceAttachmentProvider.class)); });
        deserializerMap.put("sourceUrl", (n) -> { this.setSourceUrl(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isFolder property value. Specifies whether the attachment is a link to a folder. Must set this to true if sourceUrl is a link to a folder. Optional.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFolder() {
        return this.isFolder;
    }
    /**
     * Gets the permission property value. Specifies the permissions granted for the attachment by the type of provider in providerType. Possible values are: other, view, edit, anonymousView, anonymousEdit, organizationView, organizationEdit. Optional.
     * @return a referenceAttachmentPermission
     */
    @javax.annotation.Nullable
    public ReferenceAttachmentPermission getPermission() {
        return this.permission;
    }
    /**
     * Gets the previewUrl property value. Applies to only a reference attachment of an image - URL to get a preview image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviewUrl() {
        return this.previewUrl;
    }
    /**
     * Gets the providerType property value. The type of provider that supports an attachment of this contentType. Possible values are: other, oneDriveBusiness, oneDriveConsumer, dropbox. Optional.
     * @return a referenceAttachmentProvider
     */
    @javax.annotation.Nullable
    public ReferenceAttachmentProvider getProviderType() {
        return this.providerType;
    }
    /**
     * Gets the sourceUrl property value. URL to get the attachment content. If this is a URL to a folder, then for the folder to be displayed correctly in Outlook or Outlook on the web, set isFolder to true. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceUrl() {
        return this.sourceUrl;
    }
    /**
     * Gets the thumbnailUrl property value. Applies to only a reference attachment of an image - URL to get a thumbnail image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFolder(@javax.annotation.Nullable final Boolean value) {
        this.isFolder = value;
    }
    /**
     * Sets the permission property value. Specifies the permissions granted for the attachment by the type of provider in providerType. Possible values are: other, view, edit, anonymousView, anonymousEdit, organizationView, organizationEdit. Optional.
     * @param value Value to set for the permission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermission(@javax.annotation.Nullable final ReferenceAttachmentPermission value) {
        this.permission = value;
    }
    /**
     * Sets the previewUrl property value. Applies to only a reference attachment of an image - URL to get a preview image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @param value Value to set for the previewUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewUrl(@javax.annotation.Nullable final String value) {
        this.previewUrl = value;
    }
    /**
     * Sets the providerType property value. The type of provider that supports an attachment of this contentType. Possible values are: other, oneDriveBusiness, oneDriveConsumer, dropbox. Optional.
     * @param value Value to set for the providerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProviderType(@javax.annotation.Nullable final ReferenceAttachmentProvider value) {
        this.providerType = value;
    }
    /**
     * Sets the sourceUrl property value. URL to get the attachment content. If this is a URL to a folder, then for the folder to be displayed correctly in Outlook or Outlook on the web, set isFolder to true. Required.
     * @param value Value to set for the sourceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceUrl(@javax.annotation.Nullable final String value) {
        this.sourceUrl = value;
    }
    /**
     * Sets the thumbnailUrl property value. Applies to only a reference attachment of an image - URL to get a thumbnail image. Use thumbnailUrl and previewUrl only when sourceUrl identifies an image file. Optional.
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
}
