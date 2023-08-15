package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommunicationsApplicationInstanceIdentity extends Identity implements Parsable {
    /**
     * True if the participant would not like to be shown in other participants' rosters.
     */
    private Boolean hidden;
    /**
     * The application's tenant ID.
     */
    private String tenantId;
    /**
     * Instantiates a new communicationsApplicationInstanceIdentity and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CommunicationsApplicationInstanceIdentity() {
        super();
        this.setOdataType("#microsoft.graph.communicationsApplicationInstanceIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a communicationsApplicationInstanceIdentity
     */
    @jakarta.annotation.Nonnull
    public static CommunicationsApplicationInstanceIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsApplicationInstanceIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hidden property value. True if the participant would not like to be shown in other participants' rosters.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Gets the tenantId property value. The application's tenant ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
    /**
     * Sets the tenantId property value. The application's tenant ID.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
