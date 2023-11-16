package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Command extends Entity implements Parsable {
    /**
     * Instantiates a new Command and sets the default values.
     */
    public Command() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Command
     */
    @jakarta.annotation.Nonnull
    public static Command createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Command();
    }
    /**
     * Gets the appServiceName property value. The appServiceName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppServiceName() {
        return this.BackingStore.get("appServiceName");
    }
    /**
     * Gets the error property value. The error property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.BackingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appServiceName", (n) -> { this.setAppServiceName(n.getStringValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("packageFamilyName", (n) -> { this.setPackageFamilyName(n.getStringValue()); });
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getObjectValue(PayloadRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionTicket", (n) -> { this.setPermissionTicket(n.getStringValue()); });
        deserializerMap.put("postBackUri", (n) -> { this.setPostBackUri(n.getStringValue()); });
        deserializerMap.put("responsepayload", (n) -> { this.setResponsepayload(n.getObjectValue(PayloadResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the packageFamilyName property value. The packageFamilyName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPackageFamilyName() {
        return this.BackingStore.get("packageFamilyName");
    }
    /**
     * Gets the payload property value. The payload property
     * @return a PayloadRequest
     */
    @jakarta.annotation.Nullable
    public PayloadRequest getPayload() {
        return this.BackingStore.get("payload");
    }
    /**
     * Gets the permissionTicket property value. The permissionTicket property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPermissionTicket() {
        return this.BackingStore.get("permissionTicket");
    }
    /**
     * Gets the postBackUri property value. The postBackUri property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPostBackUri() {
        return this.BackingStore.get("postBackUri");
    }
    /**
     * Gets the responsepayload property value. The responsepayload property
     * @return a PayloadResponse
     */
    @jakarta.annotation.Nullable
    public PayloadResponse getResponsepayload() {
        return this.BackingStore.get("responsepayload");
    }
    /**
     * Gets the status property value. The status property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Gets the type property value. The type property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.BackingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appServiceName", this.getAppServiceName());
        writer.writeStringValue("error", this.getError());
        writer.writeStringValue("packageFamilyName", this.getPackageFamilyName());
        writer.writeObjectValue("payload", this.getPayload());
        writer.writeStringValue("permissionTicket", this.getPermissionTicket());
        writer.writeStringValue("postBackUri", this.getPostBackUri());
        writer.writeObjectValue("responsepayload", this.getResponsepayload());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the appServiceName property value. The appServiceName property
     * @param value Value to set for the appServiceName property.
     */
    public void setAppServiceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appServiceName", value);
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("error", value);
    }
    /**
     * Sets the packageFamilyName property value. The packageFamilyName property
     * @param value Value to set for the packageFamilyName property.
     */
    public void setPackageFamilyName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("packageFamilyName", value);
    }
    /**
     * Sets the payload property value. The payload property
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final PayloadRequest value) {
        this.BackingStore.set("payload", value);
    }
    /**
     * Sets the permissionTicket property value. The permissionTicket property
     * @param value Value to set for the permissionTicket property.
     */
    public void setPermissionTicket(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("permissionTicket", value);
    }
    /**
     * Sets the postBackUri property value. The postBackUri property
     * @param value Value to set for the postBackUri property.
     */
    public void setPostBackUri(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("postBackUri", value);
    }
    /**
     * Sets the responsepayload property value. The responsepayload property
     * @param value Value to set for the responsepayload property.
     */
    public void setResponsepayload(@jakarta.annotation.Nullable final PayloadResponse value) {
        this.BackingStore.set("responsepayload", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("status", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("type", value);
    }
}
