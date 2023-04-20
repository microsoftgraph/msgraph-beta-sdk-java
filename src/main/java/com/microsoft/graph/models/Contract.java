package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class Contract extends DirectoryObject implements Parsable {
    /** The contractType property */
    private String contractType;
    /** The customerId property */
    private UUID customerId;
    /** The defaultDomainName property */
    private String defaultDomainName;
    /** The displayName property */
    private String displayName;
    /**
     * Instantiates a new Contract and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Contract() {
        super();
        this.setOdataType("#microsoft.graph.contract");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Contract
     */
    @javax.annotation.Nonnull
    public static Contract createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contract();
    }
    /**
     * Gets the contractType property value. The contractType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContractType() {
        return this.contractType;
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getCustomerId() {
        return this.customerId;
    }
    /**
     * Gets the defaultDomainName property value. The defaultDomainName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contractType", (n) -> { this.setContractType(n.getStringValue()); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getUUIDValue()); });
        deserializerMap.put("defaultDomainName", (n) -> { this.setDefaultDomainName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("contractType", this.getContractType());
        writer.writeUUIDValue("customerId", this.getCustomerId());
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the contractType property value. The contractType property
     * @param value Value to set for the contractType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContractType(@javax.annotation.Nullable final String value) {
        this.contractType = value;
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerId(@javax.annotation.Nullable final UUID value) {
        this.customerId = value;
    }
    /**
     * Sets the defaultDomainName property value. The defaultDomainName property
     * @param value Value to set for the defaultDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultDomainName(@javax.annotation.Nullable final String value) {
        this.defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
