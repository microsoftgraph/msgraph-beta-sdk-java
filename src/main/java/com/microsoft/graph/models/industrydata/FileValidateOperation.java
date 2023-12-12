package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileValidateOperation extends ValidateOperation implements Parsable {
    /**
     * Instantiates a new FileValidateOperation and sets the default values.
     */
    public FileValidateOperation() {
        super();
        this.setOdataType("#microsoft.graph.industryData.fileValidateOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileValidateOperation
     */
    @jakarta.annotation.Nonnull
    public static FileValidateOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileValidateOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("validatedFiles", (n) -> { this.setValidatedFiles(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the validatedFiles property value. Set of files validated by the validate operation.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getValidatedFiles() {
        return this.backingStore.get("validatedFiles");
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
     * Sets the validatedFiles property value. Set of files validated by the validate operation.
     * @param value Value to set for the validatedFiles property.
     */
    public void setValidatedFiles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("validatedFiles", value);
    }
}
