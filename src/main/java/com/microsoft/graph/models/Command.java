package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class Command extends Entity implements Parsable {
    /** The appServiceName property */
    private String _appServiceName;
    /** The error property */
    private String _error;
    /** The packageFamilyName property */
    private String _packageFamilyName;
    /** The payload property */
    private PayloadRequest _payload;
    /** The permissionTicket property */
    private String _permissionTicket;
    /** The postBackUri property */
    private String _postBackUri;
    /** The responsepayload property */
    private PayloadResponse _responsepayload;
    /** The status property */
    private String _status;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new command and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Command() {
        super();
        this.setOdataType("#microsoft.graph.command");
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
        return this._appServiceName;
    }
    /**
     * Gets the error property value. The error property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Command currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appServiceName", (n) -> { currentObject.setAppServiceName(n.getStringValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getStringValue()); });
            this.put("packageFamilyName", (n) -> { currentObject.setPackageFamilyName(n.getStringValue()); });
            this.put("payload", (n) -> { currentObject.setPayload(n.getObjectValue(PayloadRequest::createFromDiscriminatorValue)); });
            this.put("permissionTicket", (n) -> { currentObject.setPermissionTicket(n.getStringValue()); });
            this.put("postBackUri", (n) -> { currentObject.setPostBackUri(n.getStringValue()); });
            this.put("responsepayload", (n) -> { currentObject.setResponsepayload(n.getObjectValue(PayloadResponse::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the packageFamilyName property value. The packageFamilyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageFamilyName() {
        return this._packageFamilyName;
    }
    /**
     * Gets the payload property value. The payload property
     * @return a payloadRequest
     */
    @javax.annotation.Nullable
    public PayloadRequest getPayload() {
        return this._payload;
    }
    /**
     * Gets the permissionTicket property value. The permissionTicket property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionTicket() {
        return this._permissionTicket;
    }
    /**
     * Gets the postBackUri property value. The postBackUri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostBackUri() {
        return this._postBackUri;
    }
    /**
     * Gets the responsepayload property value. The responsepayload property
     * @return a payloadResponse
     */
    @javax.annotation.Nullable
    public PayloadResponse getResponsepayload() {
        return this._responsepayload;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
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
        this._appServiceName = value;
    }
    /**
     * Sets the error property value. The error property
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final String value) {
        this._error = value;
    }
    /**
     * Sets the packageFamilyName property value. The packageFamilyName property
     * @param value Value to set for the packageFamilyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageFamilyName(@javax.annotation.Nullable final String value) {
        this._packageFamilyName = value;
    }
    /**
     * Sets the payload property value. The payload property
     * @param value Value to set for the payload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayload(@javax.annotation.Nullable final PayloadRequest value) {
        this._payload = value;
    }
    /**
     * Sets the permissionTicket property value. The permissionTicket property
     * @param value Value to set for the permissionTicket property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionTicket(@javax.annotation.Nullable final String value) {
        this._permissionTicket = value;
    }
    /**
     * Sets the postBackUri property value. The postBackUri property
     * @param value Value to set for the postBackUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostBackUri(@javax.annotation.Nullable final String value) {
        this._postBackUri = value;
    }
    /**
     * Sets the responsepayload property value. The responsepayload property
     * @param value Value to set for the responsepayload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponsepayload(@javax.annotation.Nullable final PayloadResponse value) {
        this._responsepayload = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
