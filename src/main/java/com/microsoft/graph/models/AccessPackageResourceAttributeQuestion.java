package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageResourceAttributeQuestion extends AccessPackageResourceAttributeSource implements Parsable {
    /**
     * The question asked in order to get the value of the attribute
     */
    private AccessPackageQuestion question;
    /**
     * Instantiates a new accessPackageResourceAttributeQuestion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageResourceAttributeQuestion() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageResourceAttributeQuestion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceAttributeQuestion
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceAttributeQuestion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceAttributeQuestion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("question", (n) -> { this.setQuestion(n.getObjectValue(AccessPackageQuestion::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the question property value. The question asked in order to get the value of the attribute
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nullable
    public AccessPackageQuestion getQuestion() {
        return this.question;
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
        writer.writeObjectValue("question", this.getQuestion());
    }
    /**
     * Sets the question property value. The question asked in order to get the value of the attribute
     * @param value Value to set for the question property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestion(@javax.annotation.Nullable final AccessPackageQuestion value) {
        this.question = value;
    }
}
