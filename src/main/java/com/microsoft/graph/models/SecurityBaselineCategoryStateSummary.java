package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The security baseline per category compliance state summary for the security baseline of the account.
 */
public class SecurityBaselineCategoryStateSummary extends SecurityBaselineStateSummary implements Parsable {
    /**
     * The category name
     */
    private String displayName;
    /**
     * Instantiates a new securityBaselineCategoryStateSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineCategoryStateSummary() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineCategoryStateSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineCategoryStateSummary
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineCategoryStateSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineCategoryStateSummary();
    }
    /**
     * Gets the displayName property value. The category name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
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
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the displayName property value. The category name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
}
