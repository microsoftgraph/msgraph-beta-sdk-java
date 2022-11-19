package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommunicationsApplicationInstanceIdentity extends Identity implements Parsable {
    /** True if the participant would not like to be shown in other participants' rosters. */
    private Boolean _hidden;
    /** The application's tenant ID. */
    private String _tenantId;
    /**
     * Instantiates a new CommunicationsApplicationInstanceIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CommunicationsApplicationInstanceIdentity() {
        super();
        this.setOdataType("#microsoft.graph.communicationsApplicationInstanceIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommunicationsApplicationInstanceIdentity
     */
    @javax.annotation.Nonnull
    public static CommunicationsApplicationInstanceIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsApplicationInstanceIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommunicationsApplicationInstanceIdentity currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hidden", (n) -> { currentObject.setHidden(n.getBooleanValue()); });
        deserializerMap.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the hidden property value. True if the participant would not like to be shown in other participants' rosters.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this._hidden;
    }
    /**
     * Gets the tenantId property value. The application's tenant ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
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
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the hidden property value. True if the participant would not like to be shown in other participants' rosters.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this._hidden = value;
    }
    /**
     * Sets the tenantId property value. The application's tenant ID.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
