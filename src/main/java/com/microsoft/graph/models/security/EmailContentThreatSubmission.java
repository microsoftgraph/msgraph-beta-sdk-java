package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailContentThreatSubmission extends EmailThreatSubmission implements Parsable {
    /** Base64 encoded file content. */
    private String fileContent;
    /**
     * Instantiates a new EmailContentThreatSubmission and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmailContentThreatSubmission() {
        super();
        this.setOdataType("#microsoft.graph.security.emailContentThreatSubmission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailContentThreatSubmission
     */
    @javax.annotation.Nonnull
    public static EmailContentThreatSubmission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailContentThreatSubmission();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileContent", (n) -> { this.setFileContent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileContent property value. Base64 encoded file content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileContent() {
        return this.fileContent;
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
        writer.writeStringValue("fileContent", this.getFileContent());
    }
    /**
     * Sets the fileContent property value. Base64 encoded file content.
     * @param value Value to set for the fileContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileContent(@javax.annotation.Nullable final String value) {
        this.fileContent = value;
    }
}
