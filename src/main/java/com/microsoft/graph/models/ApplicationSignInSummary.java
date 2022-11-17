package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicationSignInSummary extends Entity implements Parsable {
    /** Name of the application that the user signed into. */
    private String _appDisplayName;
    /** Count of failed sign-ins made by the application. */
    private Long _failedSignInCount;
    /** Count of successful sign-ins made by the application. */
    private Long _successfulSignInCount;
    /** Percentage of successful sign-ins made by the application. */
    private Double _successPercentage;
    /**
     * Instantiates a new ApplicationSignInSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationSignInSummary() {
        super();
        this.setOdataType("#microsoft.graph.applicationSignInSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplicationSignInSummary
     */
    @javax.annotation.Nonnull
    public static ApplicationSignInSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationSignInSummary();
    }
    /**
     * Gets the appDisplayName property value. Name of the application that the user signed into.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the failedSignInCount property value. Count of failed sign-ins made by the application.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFailedSignInCount() {
        return this._failedSignInCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplicationSignInSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("failedSignInCount", (n) -> { currentObject.setFailedSignInCount(n.getLongValue()); });
            this.put("successfulSignInCount", (n) -> { currentObject.setSuccessfulSignInCount(n.getLongValue()); });
            this.put("successPercentage", (n) -> { currentObject.setSuccessPercentage(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the successfulSignInCount property value. Count of successful sign-ins made by the application.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSuccessfulSignInCount() {
        return this._successfulSignInCount;
    }
    /**
     * Gets the successPercentage property value. Percentage of successful sign-ins made by the application.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSuccessPercentage() {
        return this._successPercentage;
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
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeLongValue("failedSignInCount", this.getFailedSignInCount());
        writer.writeLongValue("successfulSignInCount", this.getSuccessfulSignInCount());
        writer.writeDoubleValue("successPercentage", this.getSuccessPercentage());
    }
    /**
     * Sets the appDisplayName property value. Name of the application that the user signed into.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the failedSignInCount property value. Count of failed sign-ins made by the application.
     * @param value Value to set for the failedSignInCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedSignInCount(@javax.annotation.Nullable final Long value) {
        this._failedSignInCount = value;
    }
    /**
     * Sets the successfulSignInCount property value. Count of successful sign-ins made by the application.
     * @param value Value to set for the successfulSignInCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulSignInCount(@javax.annotation.Nullable final Long value) {
        this._successfulSignInCount = value;
    }
    /**
     * Sets the successPercentage property value. Percentage of successful sign-ins made by the application.
     * @param value Value to set for the successPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessPercentage(@javax.annotation.Nullable final Double value) {
        this._successPercentage = value;
    }
}
