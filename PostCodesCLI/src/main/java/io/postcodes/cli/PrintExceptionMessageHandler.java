package io.postcodes.cli;

import picocli.CommandLine;

class PrintExceptionMessageHandler implements CommandLine.IExecutionExceptionHandler {

  public int handleExecutionException(
      Exception ex, CommandLine cmd, CommandLine.ParseResult parseResult) {
    cmd.getErr().println(cmd.getColorScheme().errorText(ex.getMessage()));
    return cmd.getExitCodeExceptionMapper() != null
        ? cmd.getExitCodeExceptionMapper().getExitCode(ex)
        : cmd.getCommandSpec().exitCodeOnExecutionException();
  }
}
