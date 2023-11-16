package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.LongRunningOperation;
import com.microsoft.graph.models.PublicError;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidateOperation extends LongRunningOperation implements Parsable {
    /**
     * Instantiates a new ValidateOperation and sets the default values.
     */
    public ValidateOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ValidateOperation
     */
    @jakarta.annotation.Nonnull
    public static ValidateOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.fileValidateOperation": return new FileValidateOperation();
            }
        }
        return new ValidateOperation();
    }
    /**
     * Gets the errors property value. Set of errors discovered through validation.
     * @return a java.util.List<PublicError>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PublicError> getErrors() {
        return this.BackingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(PublicError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the warnings property value. Set of warnings discovered through validation.
     * @return a java.util.List<PublicError>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PublicError> getWarnings() {
        return this.BackingStore.get("warnings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
    /**
     * Sets the errors property value. Set of errors discovered through validation.
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<PublicError> value) {
        this.BackingStore.set("errors", value);
    }
    /**
     * Sets the warnings property value. Set of warnings discovered through validation.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<PublicError> value) {
        this.BackingStore.set("warnings", value);
    }
}
