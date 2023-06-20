package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpRange extends RuleDestination implements Parsable {
    /** The beginAddress property */
    private String beginAddress;
    /** The endAddress property */
    private String endAddress;
    /**
     * Instantiates a new IpRange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IpRange() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.ipRange");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IpRange
     */
    @javax.annotation.Nonnull
    public static IpRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpRange();
    }
    /**
     * Gets the beginAddress property value. The beginAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBeginAddress() {
        return this.beginAddress;
    }
    /**
     * Gets the endAddress property value. The endAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEndAddress() {
        return this.endAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("beginAddress", (n) -> { this.setBeginAddress(n.getStringValue()); });
        deserializerMap.put("endAddress", (n) -> { this.setEndAddress(n.getStringValue()); });
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
        writer.writeStringValue("beginAddress", this.getBeginAddress());
        writer.writeStringValue("endAddress", this.getEndAddress());
    }
    /**
     * Sets the beginAddress property value. The beginAddress property
     * @param value Value to set for the beginAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBeginAddress(@javax.annotation.Nullable final String value) {
        this.beginAddress = value;
    }
    /**
     * Sets the endAddress property value. The endAddress property
     * @param value Value to set for the endAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndAddress(@javax.annotation.Nullable final String value) {
        this.endAddress = value;
    }
}
