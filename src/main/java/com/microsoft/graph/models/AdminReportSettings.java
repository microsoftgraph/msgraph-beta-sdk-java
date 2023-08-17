package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AdminReportSettings extends Entity implements Parsable {
    /**
     * If set to true, all reports will conceal user information such as usernames, groups, and sites. If false, all reports will show identifiable information. This property represents a setting in the Microsoft 365 admin center. Required.
     */
    private Boolean displayConcealedNames;
    /**
     * Instantiates a new adminReportSettings and sets the default values.
     */
    public AdminReportSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminReportSettings
     */
    @jakarta.annotation.Nonnull
    public static AdminReportSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminReportSettings();
    }
    /**
     * Gets the displayConcealedNames property value. If set to true, all reports will conceal user information such as usernames, groups, and sites. If false, all reports will show identifiable information. This property represents a setting in the Microsoft 365 admin center. Required.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisplayConcealedNames() {
        return this.displayConcealedNames;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayConcealedNames", (n) -> { this.setDisplayConcealedNames(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("displayConcealedNames", this.getDisplayConcealedNames());
    }
    /**
     * Sets the displayConcealedNames property value. If set to true, all reports will conceal user information such as usernames, groups, and sites. If false, all reports will show identifiable information. This property represents a setting in the Microsoft 365 admin center. Required.
     * @param value Value to set for the displayConcealedNames property.
     */
    public void setDisplayConcealedNames(@jakarta.annotation.Nullable final Boolean value) {
        this.displayConcealedNames = value;
    }
}
