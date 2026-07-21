package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.graph.beta.models.security.casemanagement.CaseEscaped;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseManagementRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CaseManagementRoot} and sets the default values.
     */
    public CaseManagementRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseManagementRoot}
     */
    @jakarta.annotation.Nonnull
    public static CaseManagementRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseManagementRoot();
    }
    /**
     * Gets the cases property value. The collection of security cases managed through the case management entry point. Supports $filter, $orderby, $select, $top, $skip, and $count.
     * @return a {@link java.util.List<CaseEscaped>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CaseEscaped> getCases() {
        return this.backingStore.get("cases");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cases", (n) -> { this.setCases(n.getCollectionOfObjectValues(CaseEscaped::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("cases", this.getCases());
    }
    /**
     * Sets the cases property value. The collection of security cases managed through the case management entry point. Supports $filter, $orderby, $select, $top, $skip, and $count.
     * @param value Value to set for the cases property.
     */
    public void setCases(@jakarta.annotation.Nullable final java.util.List<CaseEscaped> value) {
        this.backingStore.set("cases", value);
    }
}
