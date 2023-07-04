package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Command extends Entity implements Parsable {
    /**
     * The appServiceName property
     */
    private String appServiceName;
    /**
     * The error property
     */
    private String error;
    /**
     * The packageFamilyName property
     */
    private String packageFamilyName;
    /**
     * The payload property
     */
    private PayloadRequest payload;
    /**
     * The permissionTicket property
     */
    private String permissionTicket;
    /**
     * The postBackUri property
     */
    private String postBackUri;
    /**
     * The responsepayload property
     */
    private PayloadResponse responsepayload;
    /**
     * The status property
     */
    private String status;
    /**
     * The type property
     */
    private String type;
    /**
     * Instantiates a new command and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Command() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a command
     */
    @javax.annotation.Nonnull
    public static Command createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Command();
    }
    /**
     * Gets the appServiceName property value. The appServiceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppServiceName() {
        return this.appServiceName;
    }
    /**
     * Gets the error property value. The error property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageFamilyName() {
        return this.packageFamilyName;
    }
    /**
     * Gets the payload property value. The payload property
     * @return a payloadRequest
     */
    @javax.annotation.Nullable
    public PayloadRequest getPayload() {
        return this.payload;
    }
    /**
     * Gets the permissionTicket property value. The permissionTicket property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionTicket() {
        return this.permissionTicket;
    }
    /**
     * Gets the postBackUri property value. The postBackUri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostBackUri() {
        return this.postBackUri;
    }
    /**
     * Gets the responsepayload property value. The responsepayload property
     * @return a payloadResponse
     */
    @javax.annotation.Nullable
    public PayloadResponse getResponsepayload() {
        return this.responsepayload;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppServiceName(@javax.annotation.Nullable final String value) {
        this.appServiceName = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the packageFamilyName property value. The packageFamilyName property
     * @param value Value to set for the packageFamilyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageFamilyName(@javax.annotation.Nullable final String value) {
        this.packageFamilyName = value;
    }
    /**
     * Sets the payload property value. The payload property
     * @param value Value to set for the payload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayload(@javax.annotation.Nullable final PayloadRequest value) {
        this.payload = value;
    }
    /**
     * Sets the permissionTicket property value. The permissionTicket property
     * @param value Value to set for the permissionTicket property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionTicket(@javax.annotation.Nullable final String value) {
        this.permissionTicket = value;
    }
    /**
     * Sets the postBackUri property value. The postBackUri property
     * @param value Value to set for the postBackUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostBackUri(@javax.annotation.Nullable final String value) {
        this.postBackUri = value;
    }
    /**
     * Sets the responsepayload property value. The responsepayload property
     * @param value Value to set for the responsepayload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponsepayload(@javax.annotation.Nullable final PayloadResponse value) {
        this.responsepayload = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}
