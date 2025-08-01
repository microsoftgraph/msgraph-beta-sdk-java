package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebAccount extends ItemFacet implements Parsable {
    /**
     * Instantiates a new {@link WebAccount} and sets the default values.
     */
    public WebAccount() {
        super();
        this.setOdataType("#microsoft.graph.webAccount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebAccount}
     */
    @jakarta.annotation.Nonnull
    public static WebAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebAccount();
    }
    /**
     * Gets the description property value. Contains the description the user has provided for the account on the service being referenced.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * Gets the service property value. Contains basic detail about the service that is being associated.
     * @return a {@link ServiceInformation}
     */
    @jakarta.annotation.Nullable
    public ServiceInformation getService() {
        return this.backingStore.get("service");
    }
    /**
     * Gets the statusMessage property value. Contains a status message from the cloud service if provided or synchronized.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusMessage() {
        return this.backingStore.get("statusMessage");
    }
    /**
     * Gets the thumbnailUrl property value. The thumbnailUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbnailUrl() {
        return this.backingStore.get("thumbnailUrl");
    }
    /**
     * Gets the userId property value. The user name  displayed for the webaccount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the webUrl property value. Contains a link to the user&apos;s profile on the cloud service if one exists.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the service property value. Contains basic detail about the service that is being associated.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final ServiceInformation value) {
        this.backingStore.set("service", value);
    }
    /**
     * Sets the statusMessage property value. Contains a status message from the cloud service if provided or synchronized.
     * @param value Value to set for the statusMessage property.
     */
    public void setStatusMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusMessage", value);
    }
    /**
     * Sets the thumbnailUrl property value. The thumbnailUrl property
     * @param value Value to set for the thumbnailUrl property.
     */
    public void setThumbnailUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbnailUrl", value);
    }
    /**
     * Sets the userId property value. The user name  displayed for the webaccount.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the webUrl property value. Contains a link to the user&apos;s profile on the cloud service if one exists.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
