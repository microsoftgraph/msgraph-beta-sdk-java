package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebAccount extends ItemFacet implements Parsable {
    /**
     * Contains the description the user has provided for the account on the service being referenced.
     */
    private String description;
    /**
     * The service property
     */
    private ServiceInformation service;
    /**
     * Contains a status message from the cloud service if provided or synchronized.
     */
    private String statusMessage;
    /**
     * The thumbnailUrl property
     */
    private String thumbnailUrl;
    /**
     * The user name  displayed for the webaccount.
     */
    private String userId;
    /**
     * Contains a link to the user's profile on the cloud service if one exists.
     */
    private String webUrl;
    /**
     * Instantiates a new WebAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebAccount() {
        super();
        this.setOdataType("#microsoft.graph.webAccount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebAccount
     */
    @javax.annotation.Nonnull
    public static WebAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebAccount();
    }
    /**
     * Gets the description property value. Contains the description the user has provided for the account on the service being referenced.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getObjectValue(ServiceInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("statusMessage", (n) -> { this.setStatusMessage(n.getStringValue()); });
        deserializerMap.put("thumbnailUrl", (n) -> { this.setThumbnailUrl(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the service property value. The service property
     * @return a ServiceInformation
     */
    @javax.annotation.Nullable
    public ServiceInformation getService() {
        return this.service;
    }
    /**
     * Gets the statusMessage property value. Contains a status message from the cloud service if provided or synchronized.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }
    /**
     * Gets the userId property value. The user name  displayed for the webaccount.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the webUrl property value. Contains a link to the user's profile on the cloud service if one exists.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("service", this.getService());
        writer.writeStringValue("statusMessage", this.getStatusMessage());
        writer.writeStringValue("thumbnailUrl", this.getThumbnailUrl());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the description property value. Contains the description the user has provided for the account on the service being referenced.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the service property value. The service property
     * @param value Value to set for the service property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setService(@javax.annotation.Nullable final ServiceInformation value) {
        this.service = value;
    }
    /**
     * Sets the statusMessage property value. Contains a status message from the cloud service if provided or synchronized.
     * @param value Value to set for the statusMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusMessage(@javax.annotation.Nullable final String value) {
        this.statusMessage = value;
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnailUrl(@javax.annotation.Nullable final String value) {
        this.thumbnailUrl = value;
    }
    /**
     * Sets the userId property value. The user name  displayed for the webaccount.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the webUrl property value. Contains a link to the user's profile on the cloud service if one exists.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
