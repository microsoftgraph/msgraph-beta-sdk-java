package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Citation extends FilePlanDescriptorBase implements Parsable {
    /**
     * Represents the jurisdiction or agency that published the citation.
     */
    private String citationJurisdiction;
    /**
     * Represents the URL to the published citation.
     */
    private String citationUrl;
    /**
     * Instantiates a new citation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Citation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a citation
     */
    @jakarta.annotation.Nonnull
    public static Citation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Citation();
    }
    /**
     * Gets the citationJurisdiction property value. Represents the jurisdiction or agency that published the citation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCitationJurisdiction() {
        return this.citationJurisdiction;
    }
    /**
     * Gets the citationUrl property value. Represents the URL to the published citation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCitationUrl() {
        return this.citationUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("citationJurisdiction", (n) -> { this.setCitationJurisdiction(n.getStringValue()); });
        deserializerMap.put("citationUrl", (n) -> { this.setCitationUrl(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("citationJurisdiction", this.getCitationJurisdiction());
        writer.writeStringValue("citationUrl", this.getCitationUrl());
    }
    /**
     * Sets the citationJurisdiction property value. Represents the jurisdiction or agency that published the citation.
     * @param value Value to set for the citationJurisdiction property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCitationJurisdiction(@jakarta.annotation.Nullable final String value) {
        this.citationJurisdiction = value;
    }
    /**
     * Sets the citationUrl property value. Represents the URL to the published citation.
     * @param value Value to set for the citationUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCitationUrl(@jakarta.annotation.Nullable final String value) {
        this.citationUrl = value;
    }
}
