package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MdmWindowsInformationProtectionPolicyPolicySetItemCollectionResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /** The value property */
    private java.util.List<MdmWindowsInformationProtectionPolicyPolicySetItem> _value;
    /**
     * Instantiates a new MdmWindowsInformationProtectionPolicyPolicySetItemCollectionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MdmWindowsInformationProtectionPolicyPolicySetItemCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MdmWindowsInformationProtectionPolicyPolicySetItemCollectionResponse
     */
    @javax.annotation.Nonnull
    public static MdmWindowsInformationProtectionPolicyPolicySetItemCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MdmWindowsInformationProtectionPolicyPolicySetItemCollectionResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(MdmWindowsInformationProtectionPolicyPolicySetItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a mdmWindowsInformationProtectionPolicyPolicySetItem
     */
    @javax.annotation.Nullable
    public java.util.List<MdmWindowsInformationProtectionPolicyPolicySetItem> getValue() {
        return this._value;
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
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final java.util.List<MdmWindowsInformationProtectionPolicyPolicySetItem> value) {
        this._value = value;
    }
}
